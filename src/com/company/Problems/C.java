package com.company.Problems;

import java.util.*;

class Node{
    private final int x;
    private final int y;
    private final int height;

    public Node(int x, int y, int height) {
        this.x = x;
        this.y = y;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getHeight() {
        return height;
    }
}

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int columns = scanner.nextInt(), rows = scanner.nextInt();

        Node[][] farm = new Node[rows][columns];

        //Initialize nodes.
        for(int row = 0; row < rows; row++){
            for(int column = 0; column < columns; column++){
                int value = scanner.nextInt();
                farm[row][column] = new Node(column, row, value);
            }
        }

        getPools(farm, rows, columns);
    }

    private static void getPools(Node[][] farm, int rows, int columns){
        ArrayList<ArrayList<Node>> graphs = new ArrayList<>();

        for(int row = 0; row < rows; row++){
            for(int column = 0; column < columns; column++){
                Node origin = farm[row][column];

                //For each node in the matrix get the tree that can be formed.
                ArrayList<Node> graph = getConnected(farm, origin, rows, columns);
                graphs.add(graph);
            }
        }

        //Get only the unique trees.
        Set<ArrayList<Node>> uniques = getUniqueTrees(graphs);

        int pools = 0;
        for(ArrayList<Node> trees : uniques){
            HashMap<Integer, Integer> frequency = new HashMap<>();

            //Find the height frequency for each node.
            for(Node node : trees){
                int height = node.getHeight();
                frequency.putIfAbsent(height, 0);
                frequency.put(height, frequency.get(height) + 1);
            }

            //Tree has only 1 height value.
            if(frequency.size() == 1){
                int height = (int) frequency.values().toArray()[0];
                pools += height;
            }
        }

        System.out.println(pools);
    }

    private static Set<ArrayList<Node>> getUniqueTrees(ArrayList<ArrayList<Node>> trees){
        return new LinkedHashSet<>(trees);
    }

    private static ArrayList<Node> getConnected(Node[][] farm, Node current, int rows, int columns){
        boolean[][] visited = new boolean[rows][columns];
        ArrayList<Node> graph = new ArrayList<>();

        Queue<Node> queue = new LinkedList<>();
        queue.add(current);
        visited[current.getY()][current.getX()] = true;

        while(!queue.isEmpty()){
            current = queue.remove();
            ArrayList<Node> nodes = getAdjacencyList(farm, current, visited);
            queue.addAll(nodes);
        }

        for(int row = 0; row < visited.length; row++){
            for(int column = 0; column < visited[0].length; column++){
                if(visited[row][column]){
                    graph.add(farm[row][column]);
                }
            }
        }

        return graph;
    }

    private static ArrayList<Node> getAdjacencyList(Node[][] farm, Node currentNode, boolean[][] visited){
        ArrayList<Node> adjacency = new ArrayList<>();

        int X = currentNode.getX();
        int Y = currentNode.getY();

        int boardWidth = farm[0].length - 1;
        int boardHeight = farm.length - 1;

        //NORTH
        if(Y != 0 && !visited[Y - 1][X]){
            Node northNode = farm[Y - 1][X];

            if(firstLowerThanSecond(northNode.getHeight(), currentNode.getHeight())){
                adjacency.add(northNode);
                visited[Y - 1][X] = true;
            }
        }

        //SOUTH
        if(Y != boardHeight && !visited[Y + 1][X]){
            Node southNode = farm[Y + 1][X];

            if(firstLowerThanSecond(southNode.getHeight(), currentNode.getHeight())){
                adjacency.add(southNode);
                visited[Y + 1][X] = true;
            }
        }

        //WEST
        if(X != boardWidth && !visited[Y][X + 1]){
            Node westNode = farm[Y][X + 1];

            if(firstLowerThanSecond(westNode.getHeight(), currentNode.getHeight())){
                adjacency.add(westNode);
                visited[Y][X + 1] = true;
            }
        }

        //EAST
        if(X != 0 && !visited[Y][X - 1]){
            Node eastNode = farm[Y][X - 1];

            if(firstLowerThanSecond(eastNode.getHeight(), currentNode.getHeight())){
                adjacency.add(eastNode);
                visited[Y][X - 1] = true;
            }
        }

        return adjacency;
    }

    private static boolean firstLowerThanSecond(int otherHeight, int currentHeight){
        return otherHeight <= currentHeight;
    }
}
