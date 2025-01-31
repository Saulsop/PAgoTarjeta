package com.example.pagotarjeta;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Declarar las vistas
    EditText txtNumeroTarjeta;
    EditText txtMes;
    EditText txtAnio;
    EditText txtCodigoSeguridad;
    Button btnPagar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Inicializar las vistas
        txtNumeroTarjeta = findViewById(R.id.txtNumeroTarjeta);
        txtMes = findViewById(R.id.txtMes);
        txtAnio = findViewById(R.id.txtAnio);
        txtCodigoSeguridad = findViewById(R.id.txtCodigoSeguridad);
        btnPagar = findViewById(R.id.btnPagar);

        // Configurar el clic del botón "Pagar"
        btnPagar.setOnClickListener(v-> {


                String numeroTarjeta = txtNumeroTarjeta.getText().toString();
                String mes = txtMes.getText().toString();
                String anio = txtAnio.getText().toString();
                String codigoSeguridad = txtCodigoSeguridad.getText().toString();

                // Mostrar un Toast con la información
                String mensaje = "Pagado con el numero de tarjeta  : " + numeroTarjeta ;
                Toast.makeText(MainActivity.this, mensaje, Toast.LENGTH_LONG).show();

        });
    }
}