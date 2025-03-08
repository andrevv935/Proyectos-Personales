
class Equipos{
    constructor(){
        this.jugadores = [];
        this.datosPrograma = [];
    }
    
    menu(){
        //Obtenemos los valores de los inputs
        const cantidadEquipos = parseInt(document.querySelector('#cantidad-equipos').value);
        const cantidadJugadoresEquipos = parseInt(document.querySelector('#cantidad-jugadores').value);
        const informacion = document.querySelector('#informacion');
        let cantidadTotalJugadores = cantidadEquipos * cantidadJugadoresEquipos;
        let variableAlmacenamiento = cantidadTotalJugadores;

        //Guardamos los datos en un array
        this.datosPrograma.push(cantidadEquipos, cantidadJugadoresEquipos, informacion, cantidadTotalJugadores, variableAlmacenamiento);
        
        //Si hay contenido en ambos inputs, se ejecuta el siguiente codigo
        if((cantidadEquipos) && (cantidadJugadoresEquipos)){
            //Creamos etiquetas en la pagina
            const saltoLinea = document.createElement('br');
            const agregarJugador = document.createElement('button');
            const texto = document.createElement('p');
            const listaNombresIngresados = document.createElement('ul'); 

            //Asignamos id a las etiquetas creadas anteriormente
            agregarJugador.id='agregar-jugador';
            texto.id='informacion-equipos';
            listaNombresIngresados.id='nombres-ingresados-pagina';

            //Editamos el texto de las etiquetas
            agregarJugador.textContent = 'Agregar Jugador';
            texto.textContent = `Se ha indicado que habran ${cantidadEquipos} equipos.
                                con ${cantidadJugadoresEquipos} jugadores cada uno.
                                cantidad de jugadores por registrar: ${cantidadTotalJugadores}
                                Introduzca el nombre de un jugador: `

            //Agregamos las etiquetas al div
            informacion.append(texto);
            for(let i = 0; i < cantidadTotalJugadores; i++){
                const nombreJugador = document.createElement('input');
                nombreJugador.type = 'text';
                nombreJugador.id = 'nombre-jugador-' + i;
                nombreJugador.placeholder = 'Nombre del jugador'; //Texto que aparece dentro del input

                informacion.append(nombreJugador);
            }
            informacion.append(saltoLinea);
            informacion.append(agregarJugador);
            informacion.append(listaNombresIngresados);

            //Vacia y desabilita los inputs para que no se pueda escribir en ellos y no se pueda abusar del boton
            document.querySelector('#cantidad-equipos').value = '';
            document.querySelector('#cantidad-jugadores').value = '';
            document.querySelector('#cantidad-equipos').disabled = true;
            document.querySelector('#cantidad-jugadores').disabled = true;
        }

        document.querySelector('#agregar-jugador').onclick = () => this.agregarJugador(cantidadEquipos, cantidadJugadoresEquipos, informacion, cantidadTotalJugadores); //Boton que ejecuta la funcion 'agregarJugador'
    }

    agregarJugador(){ //Agrega a los jugadores a la lista del programa
        const texto = document.querySelector('#informacion-equipos'); //Extrae el valor de la etiqueta p generada en el metodo anterior
        const listaNombresIngresados = document.querySelector('#nombres-ingresados-pagina'); //Extrae el valor de la lista generada en el metodo anterior

        if(this.datosPrograma[3] > 0){ //Si hay jugadores por registrar, se ejecuta el siguiente codigo
            for(let i = 0; i < this.datosPrograma[3]; i++){ //Extrae los valores de los inputs y los guarda en una lista
                const nombreJugador = document.querySelector('#nombre-jugador-' + i).value;
                this.jugadores.push(nombreJugador);
                document.querySelector('#nombre-jugador-' + i).value = '';
                //this.datosPrograma[3] -= 1;

                const nuevoNombre = document.createElement('li');
                nuevoNombre.textContent = nombreJugador;
                listaNombresIngresados.append(nuevoNombre);
            }

            //Cambia la informacion en la etiqueta p
            this.datosPrograma[3] = 0;
            texto.textContent = ``;
        }
    }

    crearEquipos(){ //Asigna los jugadores a los equipos
        const informacion = document.querySelector('#equipos-generados'); //Extrae el valor de la etiqueta div generada en el metodo 'menu'

        if(this.datosPrograma[3] <= 0){ //Si ya no hay jugadores por registrar, se ejecuta el siguiente codigo
            for (let j = 0; j < this.datosPrograma[0]; j++){ //Genera una nueva lista en base a la cantidad de equipos que se hallan ingresado
                const nuevoEquipo = document.createElement('ul');
                nuevoEquipo.textContent = `Equipo ${j + 1}`;
                informacion.append(nuevoEquipo);
                for (let k = 0; k < this.datosPrograma[1]; k++){ //Elige de manera aleatoria a un jugador para asignarlo a un equipo
                    const numeroRandom = Math.floor(Math.random() * this.datosPrograma[4]);
                    const jugador = this.jugadores[numeroRandom];

                    const crearJugador = document.createElement('li');
                    crearJugador.textContent = jugador;

                    this.datosPrograma[4] -= 1;
                    nuevoEquipo.append(crearJugador);
                }
            }
        }
    }

    limpiar(){ //Reinicia la pagina a su estado original
        document.querySelector('#cantidad-equipos').value = '';
        document.querySelector('#cantidad-jugadores').value = '';
    }
}

/*
const cantidadEquipos = parseInt(document.getElementById('cantidad-equipos').value); //Numero de equipos que habran
const cantidadJugadoresEquipos = parseInt(document.getElementById('cantidad-jugadores').value); //Numero de jugadores que integraran cada equipo
const informacion = document.getElementById('informacion'); //Es el div principal o bien dicho, menu
let cantidadTotalJugadores = cantidadEquipos * cantidadJugadoresEquipos; 
let variableAlmacenamiento = cantidadTotalJugadores; //Conserva los valores de 'cantidadTotalJugadores' los cuales son editados en otra funcion
*/



const equipos = new Equipos();

document.querySelector('#guardar-informacion').onclick = () => equipos.menu(); //Boton que ejecuta la funcion 'menu'
document.querySelector('#generar-equipos').onclick = () => equipos.crearEquipos(); //Boton que ejecuta la funcion 'crearEquipos'
document.querySelector('#limpiar').onclick = () => equipos.limpiar(); //Boton que ejecuta la funcion 'limpiar'