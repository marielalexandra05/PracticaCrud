package com.mariela.leon.proyectosqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mariela.leon.proyectosqlite.modelo.Empleado;

public class MainActivity extends AppCompatActivity {

    private EditText cedula;
    private EditText nombre;
    private EditText apellido;
    private EditText direccion;
    private EditText estadocivil;
    private Button  insertar, editar,eliminar,actualizar,buscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cedula = (EditText)findViewById(R.id.txtcedula);
        nombre = (EditText)findViewById(R.id.txtnombre);
        apellido =(EditText) findViewById(R.id.txtapellido);
        direccion =(EditText)findViewById(R.id.txtdireccion);
        estadocivil =(EditText) findViewById(R.id.txtEstadoCi);
        insertar =(Button) findViewById(R.id.btnInsertar);
        editar =(Button) findViewById(R.id.btnEditar);
        eliminar =(Button) findViewById(R.id.btnEliminar);

        Toast.makeText(getApplicationContext(), "->OnCreate", Toast.LENGTH_SHORT).show();
        //guardar();
        //Editar();

    }

    /* private void guardar(){
        Toast.makeText(getApplicationContext(), "->EntrandoF¡Guardar", Toast.LENGTH_SHORT).show();
        insertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "->Instanciando", Toast.LENGTH_SHORT).show();
                Empleado empleado = new Empleado();
                empleado.setCedula(cedula.getText().toString());
                empleado.setNombre(nombre.getText().toString());
                empleado.setApellido(apellido.getText().toString());
                empleado.setDireccion(direccion.getText().toString());
                empleado.setEstadoCivil(estadocivil.getText().toString());
                empleado.insertarEmpleado(getApplicationContext());
                Toast.makeText(getApplicationContext(), "->OnCreate", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Editar(){
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Empleado empleado = new Empleado();
                empleado.setCedula(cedula.getText().toString());
                empleado.setNombre(nombre.getText().toString());
                empleado.setApellido(apellido.getText().toString());
                empleado.setDireccion(direccion.getText().toString());
                empleado.setEstadoCivil(estadocivil.getText().toString());
                empleado.editarEmpleado(getApplicationContext());
            }
        });
   }
*/


}