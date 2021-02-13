//////////////////////////////////////////////////////////////////////
// Author: Arthur Anthony da Cunha Romão E Silva                   ///
// Enrollment: 20190011208                                         ///
//                                                                 ///
//////////////////////////////////////////////////////////////////////

#include <iostream>

using namespace std;

void generate_adjacency_matrix(int** graph, int* visited, int length){
	for(int i=0;i<length;i++){
		visited[i] = 0;
		for(int j=0;j<length;j++)
			graph[i][j] = 0;
	}
}

void show_graph(int** graph, int* visited, int length){
	for(int i=0;i<length;i++){
		for(int j=0;j<length;j++)
			printf("%d ", graph[i][j]);
		printf("\n");
	}
	printf("\n");
	for(int i=0;i<length;i++)
		printf("%d ", visited[i]);
	printf("\n\n");
}

void addEdge(int** graph, int u, int v){
	graph[u - 1][v - 1] = 1;
	graph[v - 1][u - 1] = 1;
}

void dfs(int** graph, int* visited, int u, int length){
	cout << u << " ";
	visited[u - 1] = 1;
	for(int i=1;i<length+1;i++){
		if((graph[u - 1][i - 1] == 1) && (visited[i - 1] == 0))
			dfs(graph, visited, i, length);
	}

}

int main(void){
	int length = 5;
	int **graph = (int**) malloc(length * sizeof(int*)); 
	int *visited = (int*) malloc(sizeof(int)*length);
	
	for (int i=0; i < length; i++)
		graph[i] = (int*) malloc(length * sizeof (int));

	generate_adjacency_matrix(graph, visited, length);
	addEdge(graph, 2, 1);
	addEdge(graph, 1, 4);
	addEdge(graph, 4, 5);
	addEdge(graph, 5, 2);
	//show_graph(graph, visited, length);
	dfs(graph, visited, 1, length);
	printf("\n\n");

	return 0;
}
