package challenge;

public class CriptografiaCesariana implements Criptografia {

    private static int criptografar = 3;
    private static int descriptografar = -3;

    @Override
    public String criptografar(String texto) {
        return executarComando(texto, criptografar);
        }

    @Override
    public String descriptografar(String texto) {
        return executarComando(texto, descriptografar);
    }
    
    

    private String executarComando(String texto,int x){
        if (texto.isEmpty()) throw new IllegalArgumentException("Adicionar texto");
        if (texto == null) throw new NullPointerException("Adicionar texto");
        texto = texto.toLowerCase();
        String validacao = "";
        for(int i=0;i<texto.length();i++){
            String verificaString = ""+texto.charAt(i);
            if(verificaString.matches("\\d")){
                validacao = validacao + verificaString;
            }else if(verificaString.equals(" ")){
                validacao = validacao+ verificaString;
            }else{
                char teste = verificaString.charAt(0);
                teste += x;
                validacao += ( String )( "" + teste);
            }
        }
        return validacao;
    }

}
