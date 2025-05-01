/*
 Para completar esta tarea debes:


Desarrollar un código de Java siguiendo los pasos a continuación:

1. Crea una clase llamada Pelicula con las siguientes características:

     • Atributos: titulo, genero, creador, año, duracion y visto.

    • Constructores:

         • Un constructor default.

         • Un constructor con el titulo y creador. Los demás campos tendrán su valor default por tipo de dato. Visto tendrá false por defecto.

         •	Un constructor con todos los atributos, excepto visto.

    • Métodos:

         • Métodos get de todos los atributos, excepto visto.

         • Métodos set de todos los atributos, excepto visto.

         • Sobreescribe el método toString.


2. Crea una clase Serie con las siguientes características:

         • Sus atributos son titulo, no. de temporadas, visto, genero, creador y duracion.

         • Por default, el número de temporadas es 1 y visto false.

        • El resto de atributos serán valores por defecto según el tipo de atributo.

     • Constructores:

         • Un constructor default.

         • Un constructor con el titulo y creador. Los demás campos tendrán su valor default por tipo de dato.

         • Visto tendrá false por defecto.

         • Un constructor con todos los atributos, excepto visto.

     • Métodos:

         • Métodos get de todos los atributos, excepto visto.

         • Métodos set de todos los atributos, excepto visto.

         • Sobrescribe el método toString


3. En principio, las clases anteriores no son padre-hija, pero sí tienen atributos en común.
   Realiza el análisis correcto e impleméntalo para tener un óptimo resultado.


4. Crea una interfaz llamada Visualizable con los siguientes métodos:

     • marcarVisto() cambia el atributo de visto a true.

     • esVisto() devuelve el estado del atributo visto.

     • tiempoVisto() devuelve el tiempo en minutos/segundos que se visualizó el video.


5. Ahora crea una clase ejecutable y realiza lo siguiente:

     • Crea dos arrays de 5 elementos cada uno. Unos de Peliculas y otro de Series.

     • Crea un objeto en cada posición del array con los valores que desees. Puedes usar distintos constructores.

     • Marca en visto algunas Películas y Series con el método marcarVisto()

     • Muestra una lista de las Películas y Series que se visualizaron y un detalle de los minutos/segundos visualizados.

     • Por último, indica la serie con más temporadas y la película del año más reciente.
       Muéstralos en pantalla con toda su información (usa el método toString()).

* */

public class Main {
    public static void main(String[] args){

        Pelicula[] peliculasArray = new Pelicula[5];
        Serie[] seriesArray = new Serie[5];

        peliculasArray[0] = new Pelicula("Jurassic Park", "Steven Spielberg");
        peliculasArray[1] = new Pelicula("About time","Romance","Richard Curits",2013,123);
        peliculasArray[2] = new Pelicula("Interestellar","SciFi","Chritopher Nola",2014,159);
        peliculasArray[3] = new Pelicula("Toy Story","Steve Jobs");
        peliculasArray[4] = new Pelicula("Spirited Away","Fantasia","Hayao Miyazaki",2001,90);

        seriesArray[0] = new Serie("Silicon Valley", 6, "comedia","Mike Judge",2014,1000);
        seriesArray[1] = new Serie("The Big Bang Theory", 12,"comedia","Chuck Lorre",2008,123);
        seriesArray[2] = new Serie("We Bare Bears", "Daniel Chong");
        seriesArray[3] = new Serie("Adventure time", "Rebecca Sugar");
        seriesArray[4] = new Serie("Star vs las fuerzas del mal", "Daron Nefcy");

        peliculasArray[4].marcarVisto();
        peliculasArray[2].marcarVisto();
        seriesArray[2].marcarVisto();
        seriesArray[4].marcarVisto();

        //Recorremos el array e imprime los que esVisto == True
        System.out.println("Peliculas y series vistas\n");

        for(int j = 0; j < peliculasArray.length; j++){
            if(peliculasArray[j].esVisto()){
                System.out.print(peliculasArray[j].getTitulo());
                System.out.print("\t");
                System.out.println(peliculasArray[j].getDuracion());
            }
        }

        for(int i = 0; i < seriesArray.length; i++){
            if(seriesArray[i].esVisto()){
                System.out.print(seriesArray[i].getTitulo());
                System.out.print("\t");
                System.out.println(peliculasArray[i].getDuracion());
            }
        }

        int maxNum = 0;
        String maxNumTemp = " ";

        for(int i = 0; i < seriesArray.length;i++){
            if(seriesArray[i].getNumTemporadas() > maxNum){
                maxNum = seriesArray[i].getNumTemporadas();
                maxNumTemp = seriesArray[i].getTitulo();
            }
        }

        System.out.println("\n\n La serie con mas temporadas es: " + maxNumTemp);

        int maxAnio = 0;
        String maxAnioPeli = " ";
        for(int i = 0; i < peliculasArray.length;i++){
            if(peliculasArray[i].getAnio() > maxAnio){
                maxAnio = peliculasArray[i].getAnio();
                maxAnioPeli = peliculasArray[i].getTitulo();
            }
        }

        System.out.println("La pelicula del año mas reciente es: " + maxAnioPeli);

    }
}
