######################################################################
## Author: Arthur Anthony da Cunha Romão E Silva                   ###
## Enrollment: 20190011208                                         ###
##                                                                 ###
######################################################################

class Graph:
	def __init__(self, vertices):
		self.vertices = vertices
		self.grafo = [[0] * vertices for i in range(vertices)]
		self.visitados = [False] * vertices

	def addEdge(self, u, v):
		self.grafo[u - 1][v - 1] = 1
		self.grafo[v - 1][u - 1] = 1

	def show(self):
		for i in self.grafo:
			for j in i:
				print(j, end=' ')
			print('')	

	def dfs(self, u):
		print("%d "%u, end="")
		self.visitados[u - 1] = True		
		for i in range(1, self.vertices + 1):
			if self.grafo[u - 1][i - 1] == 1 and self.visitados[i - 1] == False:
				self.dfs(i)
		



g = Graph(5)

g.addEdge(1, 4)
g.addEdge(4, 2)
g.addEdge(4, 5)
g.addEdge(2, 5)
g.addEdge(5, 3)

#g.show()
g.dfs(1)
print("\n")

