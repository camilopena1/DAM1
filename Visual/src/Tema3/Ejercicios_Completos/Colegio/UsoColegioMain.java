package Tema3.Ejercicios_Completos.Colegio;

public class UsoColegioMain {
    public static void main(String[] args) {
        Colegio JuanDe = new Colegio("Juan de la hierva ", 2);
        Colegio LaPaloma = new Colegio("La paloma de la paz ", 2);
        JuanDe.nuevoAlumno("Lola", 1.2);
        JuanDe.nuevoAlumno("Pepe", 7.2);
        JuanDe.getDatosAlumno("Lola");

        LaPaloma.nuevoAlumno("Ana", 1);
        LaPaloma.nuevoAlumno("Paco", 6.7);
        LaPaloma.nuevoAlumno("Jose", 9);

        LaPaloma.getTodosAlumnos();
        LaPaloma.expulsarAlumno("Paco");
        LaPaloma.setNotaMedia("Ana", 10);
        JuanDe.getTodosAlumnos();
        LaPaloma.getTodosAlumnos();

    }
}
