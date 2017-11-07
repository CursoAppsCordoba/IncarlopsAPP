package incarlopsa.com.appincarlopsa;

public interface ICodigos extends ICodigosAntonio,
                                ICodigosDavid,
                                ICodigosEdu,
        ICodigosJonatan,
                                ICodigosNela {

    //Codigos iguales o inferiores a 100

    //Codigos universales
    int TODO_OK = 0;
    int CANCELAR = -1;
    int SALIR = -999;
    int ENTRADA_DUPLICADA = 1062;

    //Codigos para TEST de consultas
    String TEST_TIPO_EMPLEADO = "Empleado";

    //Codigos para consultas
    String DAME_TODOS = "DAME_TODOS";
    String ACTUALIZA_FECHA = "ACTUALIZA_FECHA";
    String DAME_LOS_TOPIC = "DAME_LOS_TOPIC";  //ESTE ES PARA PUBLICACIONES
    String DAME_LOS_TOPIC_DESDE_MI= "DAME_LOS_TOPIC_DESDE_MI";
    String DAME_LOS_TOPIC_HACIA_MI = "DAME_LOS_TOPIC_HACIA_MI";

    //Codigos para conexion a la BBDD
//    String SERVIDOR_BBDD = "192.168.0.101";
    String SERVIDOR_BBDD = "10.20.32.116";
    String PUERTO_BBDD = "3306";
    String BBDD = "incarlopsa";
    String DIRECCION_BBDD_RAIZ = "jdbc:mysql://"+SERVIDOR_BBDD + ":" + PUERTO_BBDD
                            +"/"+BBDD;
    String DIRECCION_BBDD_USUARIO = "?user=";
    String DIRECCION_BBDD_PASSWORD = "&password=";

    String USUARIO_TEST_NORMAL = "TESTUSER";
    String PASSWORD_TEST_NORMAL = "TESTUSER";
    String USUARIO_TEST_RRHH = "TESTRRHH";
    String PASSWORD_TEST_RRHH = "TESTRRHH";

    //Codigos para control de excepciones
    String ERROR_CONEXION_BBDD = "No se ha podido establecer la conexión con la base de datos";
    String ERROR_DRIVER = "Error en la carga del driver";
    String ERROR_LOGIN = "Usuario y contraseña inválidos";
    String ERROR_INTRODUCIR_DATOS = "Introduzca el usuario y contraseña";

}
