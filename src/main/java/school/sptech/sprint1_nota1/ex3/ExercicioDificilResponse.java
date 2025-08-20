package school.sptech.sprint1_nota1.ex3;

import java.util.ArrayList;
import java.util.List;

public class ExercicioDificilResponse {

    int enesimoTermo;
    int soma;

    public ExercicioDificilResponse(int enesimoTermo, int soma) {
        this.enesimoTermo = enesimoTermo;
        this.soma = soma;
    }

    public int getEnesimoTermo() {
        return enesimoTermo;
    }

    public void setEnesimoTermo(int n) {
        List<Integer> lista = this.gerarFibonacci(n);
        this.enesimoTermo = lista.get(lista.size() - 1);
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int n) {
        List<Integer> lista = this.gerarFibonacci(n);
        int total = 0;
        for (int valor : lista) {
            total += valor;
        }
        this.soma = total;
    }

    private List<Integer> gerarFibonacci(int n) {
        List<Integer> lista = new ArrayList<>(List.of(0, 1));
        if (n <= 0){
            lista.clear();
            lista.add(0);
        } else {
            for (int i = 2; i <= n; i++) {
                int ultimo = lista.get(lista.size() - 1);
                int penultimo = lista.get(lista.size() - 2);
                lista.add(ultimo + penultimo);
            }
        }

        return lista;
    }
}
