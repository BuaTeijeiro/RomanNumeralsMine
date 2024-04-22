package validroman;

import java.util.HashMap;

public class RomanNumeral {
    String roman;
    HashMap<Character,Integer> diccionario = new HashMap<>();

    public RomanNumeral(String roman){
        this.roman = roman;
        this.initializeDict();
    }

    void initializeDict(){
        this.diccionario.put('M', 1000);
        this.diccionario.put('D', 500);
        this.diccionario.put('C', 100);
        this.diccionario.put('L', 50);
        this.diccionario.put('X', 10);
        this.diccionario.put('V', 5);
        this.diccionario.put('I', 1);
    }

    int consultValue(char letter){
        if (this.diccionario.containsKey(letter)){
            return this.diccionario.get(letter);
        } else {
            return 0;
        }
    }

    String getRomanNumeral(){
        return this.roman;
    }

    public boolean checkValidity(){
        String regex = "M{0,3}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})";
        return this.getRomanNumeral().matches(regex);
    }

    public int getDecimal(){
        int decimal = 0;
        String word = this.getRomanNumeral();
        int last = word.length() - 1;
        for(int i = last; i>= 0; i--){
            if (i == last || this.consultValue(word.charAt(i)) >= this.consultValue(word.charAt(i + 1))){
                decimal += this.consultValue(word.charAt(i));
            } else {
                decimal -= this.consultValue(word.charAt(i));
            }
        }
        return decimal;
    }

    public void printIfValid(){
        if(this.checkValidity()){
            System.out.println(this.getDecimal());
        } else{
            System.out.println("Numero romano no valido");
        }
    }
}
