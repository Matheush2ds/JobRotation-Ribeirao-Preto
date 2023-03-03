public class Veiculos {

    public static void main(String[] args) {

        // velocidade em km/h
        int velocidadeCarro = 110;
        int velocidadeCaminhao = 80;

        // tempo em horas
        double tempoCarro = 0.0d;
        double tempoCaminhao = 0.0d;

        // distância em km
        double distanciaTotal = 100.0d;
        double distanciaRP = 50.0d;

        // tempo gasto pelo carro
        tempoCarro = distanciaRP / velocidadeCarro;

        // tempo gasto pelo caminhão
        tempoCaminhao = distanciaTotal - distanciaRP;
        tempoCaminhao /= velocidadeCaminhao;
        tempoCaminhao += 0.08333333333333333 * 2; // considerando 2 pedágios com 5 minutos cada

        // verificando qual veículo está mais próximo de Ribeirão Preto
        if (tempoCarro < tempoCaminhao) {
            System.out.println("O carro está mais próximo de Ribeirão Preto.");
        } else {
            System.out.println("O caminhão está mais próximo de Ribeirão Preto.");
        }

    }
}

/* A saída do programa será: "O carro está mais próximo de Ribeirão Preto." Isso ocorre porque o carro
leva menos tempo para percorrer a distância até o ponto de cruzamento na rodovia. Como a velocidade dele
é maior do que a do caminhão, ele consegue percorrer mais distância em menos tempo, mesmo considerando que
o caminhão precisa parar nos pedágios e, por isso, demora mais.
*/