package ordenamientoRaiz;

public class StringUtil
{
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n)
    {
        String replicado = "";
        for (int i=0;i<n;i++){
            replicado += c;
        }
        return replicado;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c)
    {
        String lpad = replicate(c,n-s.length())+s;
        return lpad;
    }

    public static String rpad(String s, int n, char c)
    {
        String rpad = s + replicate(c,n-s.length());
        return rpad;
    }

    public static String ltrim(String s)
    {
        int i = 0;
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }
        return s.substring(i);
    }

    public static String rtrim(String s)
    {
        int i = s.length()-1;
        while (i > 0 && Character.isWhitespace(s.charAt(i))) {
            i--;
        }
        return s.substring(0,i+1);
    }

    public static String trim(String s)
    {
        return s.trim();
    }
    public static int indexOfN(String s,char c,int n)
    {
        int i;
        int count=0;
        for(i=0; i<s.length()-1;i++){
            if(s.charAt(i) == c)
            {
                count++;
                if(count==n)
                    return i;
            }
        }
        return -1;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[])
    {
        String[] sArray = new String[arr.length];
        for(int i=0;i< arr.length;i++){
            sArray[i]=arr[i]+"";
        }
        return sArray;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[])
    {
        int[] iArray = new int[arr.length];
        for(int i=0;i< arr.length;i++){
            iArray[i]= Integer.parseInt(arr[i]);
        }
        return iArray;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[])
    {
        int maxL = 0;
        for (String s:arr) {
            if(s.length()>maxL){
                maxL=s.length();
            }
        }
        return maxL;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c)
    {
        int maxL = maxLength(arr);
        for(int i=0;i< arr.length;i++){
            arr[i]=lpad(arr[i],maxL,c);
        }
    }
}
