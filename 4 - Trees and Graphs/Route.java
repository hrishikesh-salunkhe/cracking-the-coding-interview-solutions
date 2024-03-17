//4.1 - Route Between Nodes: Given a directed graph, design an algorithm to find out whether there is a route between two nodes.

public class Route {
    
    private static int[][] adjMatrix = new int[5][5];

    public static boolean isRoutePresent(int nodeA, int nodeB){
        System.out.println(nodeA +", "+nodeB);
        for(int i=0; i<adjMatrix[nodeA].length; i++){
            if(adjMatrix[nodeA][i] == 1){
                if(i == nodeB){
                    return true;
                }
                else if(i == nodeA){
                    return false;
                }
                else{
                    return isRoutePresent(i, nodeB);
                }
            }
        }

        return false;
    }
    
    public static void main(String[] args){
        for(int i=0; i<adjMatrix.length; i++){
            for(int j=0; j<adjMatrix[i].length; j++){
                adjMatrix[i][j] = 0;
            }
        }

        adjMatrix[0][1] = 1;
        adjMatrix[0][2] = 1;
        adjMatrix[1][3] = 1;
        adjMatrix[2][3] = 1;
        adjMatrix[3][4] = 1;
        adjMatrix[4][2] = 1;

        System.out.println(isRoutePresent(3,0));
    }
}
