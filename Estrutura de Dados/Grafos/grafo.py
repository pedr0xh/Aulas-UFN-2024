
class Grafo:
    def __init__(self, v):
        self.v = []
        self.v.extend(v)
        self.qtdV = len(v)
        self.qtdA = 0
        self.mAdj = [[0 for _ in range(self.qtdV)] for _ in range(self.qtdV)]

    def inserirArestaSim(self, origem, destino):
        indOrigem = self.v.index(origem)
        indDestino = self.v.index(destino)
        if origem.lower() == destino.lower() or indOrigem == -1 or indDestino == -1:
            return

        if self.mAdj[indOrigem][indDestino] == 0:
            self.mAdj[indOrigem][indDestino] = 1
            self.qtdA += 1
        if self.mAdj[indDestino][indOrigem] == 0:
            self.mAdj[indDestino][indOrigem] = 1
            self.qtdA += 1

    def show(self):
        for i in range(self.qtdV):
            print(self.v[i], end="\t\t\t")
            for j in range(self.qtdV):
                if self.mAdj[i][j] != 0:
                    print(self.v[j], end="\t\t\t")
            print()

    def mostrarGrau(self, cidade):
        ind = self.v.index(cidade)
        if ind == -1:
            return -27
        qtd = 0
        for i in range(self.qtdV):
            if self.mAdj[ind][i] != 0:
                qtd += 1
            if self.mAdj[i][ind] != 0:
                qtd += 1
        return qtd


if __name__ == "__main__":
    cidades = ["Sao Pedro", "Santa Maria", "Agudo", "Santa Cruz", "Itaara", "Sao Martinho", "Julio de Castilhos", "Cruz Alta", "Soledade", "Lajeado", "Porto Alegre"]
    cidades.sort()

    grafo = Grafo(cidades)
    grafo.inserirArestaSim("Sao Pedro", "Santa Maria")
    grafo.inserirArestaSim("Santa Maria", "Agudo")
    grafo.inserirArestaSim("Agudo", "Santa Cruz")
    grafo.inserirArestaSim("Santa Cruz", "Porto Alegre")
    grafo.inserirArestaSim("Porto Alegre", "Lajeado")
    grafo.inserirArestaSim("Lajeado", "Soledade")
    grafo.inserirArestaSim("Soledade", "Cruz Alta")
    grafo.inserirArestaSim("Cruz Alta", "Julio de Castilhos")
    grafo.inserirArestaSim("Julio de Castilhos", "Itaara")
    grafo.inserirArestaSim("Itaara", "Sao Martinho")
    grafo.inserirArestaSim("Itaara", "Santa Maria")

    grafo.show()

    cidade = "Itaara"
    print("Grau da cidade de " + cidade + ": " + str(grafo.mostrarGrau(cidade)))
