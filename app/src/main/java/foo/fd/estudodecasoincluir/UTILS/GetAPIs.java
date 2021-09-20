package foo.fd.estudodecasoincluir.UTILS;

public class GetAPIs {
    String fora = "10.0.0.104";
    String ipCasa = "192.168.1.108";

    String caminho = ipCasa;
    public String getListarCidade(){
        return  "http://"+caminho+"/curso_udemy/exer/APIListarCidades.php";

    }

    public String getListarEstado(){
        return  "http://"+caminho+"/curso_udemy/exer/ApiListarEstados.php";

    }

    public String getALterarCidade(){
        return "http://"+caminho+"/curso_udemy/exer/UPDATE_ESTADO.php";
    }


    public String getDeleteCidade(){
        return "http://"+caminho+"/curso_udemy/exer/APIDeleteCidade.php";

    }

    public String getDeleteEstado(){
        return "http://"+caminho+"/curso_udemy/exer/DELETE_ESTADOj.php";
    }

    public String getIncluirCidade(){
        return "http://"+caminho+"/curso_udemy/exer/INSERIR_Cidade.php";
    }

}
