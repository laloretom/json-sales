import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import com.google.gson.*;

public class jsonVentasxDepartamento {
    private static HashMap<String, Double> VentasxDepartamento = new HashMap<>();

    public static void main(String[] args) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("sales_array.json");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Gson gson = new Gson();
        Sale[] sales = gson.fromJson(fileReader, Sale[].class);

        for (Sale sale: sales) {
            if ( VentasxDepartamento.containsKey(sale.department) ) {
                double sum = VentasxDepartamento.get(sale.department);
                VentasxDepartamento.put( sale.department, sum + sale.sales );
            } else {
                VentasxDepartamento.put(sale.department, sale.sales );
            }
        }

        for (HashMap.Entry<String, Double> entry : VentasxDepartamento.entrySet()) {
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

    }
}
