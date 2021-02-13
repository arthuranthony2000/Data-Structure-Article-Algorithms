//////////////////////////////////////////////////////////////////////
// Author: Arthur Anthony da Cunha Romão E Silva                   ///
// Enrollment: 20190011208                                         ///
//                                                                 ///
//////////////////////////////////////////////////////////////////////


#include <iostream>
#include <queue>

using namespace std;

void addEdge(int** mat, int u, int v){
	mat[u - 1][v - 1] = 1;
	mat[v - 1][u - 1] = 1;
}

void show(int **mat, int length){
	for(int i=0;i<length;i++){
		for(int j=0;j<length;j++){
			cout << mat[i][j] << " ";
		}
		cout << endl;
	}
}

void bfs(int** mat, int length, int* visited, int u){
	cout << u << " ";
	queue<int> Q;
	Q.push(u - 1);
	visited[u -1] = 1;
	
	while(Q.size() > 0){
		u = Q.front();
		for(int v=0;v<length;v++){
			if(mat[u][v] == 1 && visited[v] == 0){
				visited[v] = 1;
				Q.push(v);
				cout << v + 1 << " ";
			}
		}
		Q.pop();
	}
	cout << endl;
}

int main(int argc, char* argv[]){
	int length = 7;
	int** mat = (int**) calloc(length, sizeof(int*));
	int *visited = (int*) calloc(length, sizeof(int));

	for(int i=0;i<length;i++)
		mat[i] = (int*) calloc(length, sizeof(int));	

	addEdge(mat, 1, 2);
	addEdge(mat, 2, 3);
	addEdge(mat, 3, 4);
	addEdge(mat, 4, 5);
	addEdge(mat, 5, 6);
	addEdge(mat, 6, 7);


	bfs(mat, length, visited, 1);
	cout << endl;
	return 0;
}