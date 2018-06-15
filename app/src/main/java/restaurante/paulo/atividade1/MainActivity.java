package restaurante.paulo.atividade1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {


    private EditText ed1_consumo;
    private EditText ed2_couvert_artistico;
    private EditText ed3_dividir;

    private Button bt_calcular;

    private EditText ed4_servico;
    private EditText ed5_conta_total;
    private EditText ed6_valor_pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);


        ed1_consumo = (EditText)findViewById(R.id.edt_consumo);
        ed2_couvert_artistico = (EditText)findViewById(R.id.edt_couvert_artistico);
        ed3_dividir = (EditText)findViewById(R.id.edt_dividir);

        bt_calcular = (Button) findViewById(R.id.bt_calcular);

        ed4_servico = (EditText)findViewById(R.id.edt_servico);
        ed5_conta_total = (EditText)findViewById(R.id.edt_conta_total);
        ed6_valor_pessoa = (EditText)findViewById(R.id.edt_valor_pessoa);


        bt_calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double consumo = Double.parseDouble(ed1_consumo.getText().toString());
                double couvert = Double.parseDouble(ed2_couvert_artistico.getText().toString());
                int qtpessoas = Integer.parseInt(ed3_dividir.getText().toString());

                double servico = ((consumo + couvert) * 0.10);
                double contatotal = consumo + couvert;
                double valorpessoa = contatotal / qtpessoas;
                DecimalFormat df = new DecimalFormat();

                ed4_servico.setText(String.format(df.format(servico)));
                ed5_conta_total.setText(String.format(df.format(contatotal)));
                ed6_valor_pessoa.setText(String.format(df.format(valorpessoa)));


            }
        });




    }
}
