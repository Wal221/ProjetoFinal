package ProjFinal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) throws IOException {

        FileReader fw = new FileReader("src/Lista1/diary");
        List<String> registros = new ArrayList<String>();
        // envolve um BufferedReader em torno de FileReader
        BufferedReader bufferedReader = new BufferedReader(fw);

        // use o método readLine do BufferedReader para ler uma linha por vez.
        // o método readLine retorna null quando não há mais nada para ler.
        String linha = bufferedReader.readLine();
        while ((linha != null)) {

            registros.add(linha);
        }
        // fecha o BufferedReader quando terminamos
        bufferedReader.close();

        for (String ler : registros) {
            System.out.println(registros);

        }


    }
}
