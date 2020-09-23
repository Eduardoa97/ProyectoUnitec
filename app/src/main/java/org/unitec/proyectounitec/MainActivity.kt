package org.unitec.proyectounitec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//EL PUNTO DE PARTIDA DE TODA APP ES LA MAINACTIVYTI (PRESENTER)

/*
Public class TarjetaCredito extends Tarjeta{
public TarjetaCredito(){
super();
}
}
 */
class MainActivity : AppCompatActivity() {
    //fun en kotlin es una palabra reservada para implementar o crear una funcion o metodo
    //VAMOS A PROBAR QUE FUNCIONA GITHUB
    override fun onCreate(nombre: Bundle?) {
        super.onCreate(nombre)
        setContentView(R.layout.activity_main)
    }
}
