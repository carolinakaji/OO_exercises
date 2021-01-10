package com.exercicios;

import com.exercicios.model.Retangulo;

/**
 * Escreva uma classe Retangulo para representar um retângulo. A classe deve
 * conter:
 * 
 * a) Dois campos de dados do tipo double chamados largura e altura que
 * especificam a largura e a altura do retângulo. Os valores padrões são 1 tanto
 * para a largura quanto para a altura.
 * 
 * b) Um campo de dado do tipo String chamado cor que especifica a cor do
 * retângulo. Para este exercício em particular, assuma que TODOS os retângulos
 * possuirão a mesma cor. A cor padrão é branco.
 * 
 * c) Um construtor sem argumentos que cria um retângulo padrão.
 * 
 * d) Um construtor que cria um retângulo com a largura e altura especificadas.
 * 
 * e) Métodos get() e set() para os três campos de dados da classe.
 * 
 * f) Um método chamado getArea() que retorna a área do retângulo.
 * 
 * g) Um método chamado getPerimetro() que retorna o perímetro do retângulo.
 * 
 * Escreva um programa de teste que cria dois objetos da classe Retangulo. Sua
 * saída deverá ser parecida com:
 *
 */
public class App {
    public static void main(String[] args) {

        Retangulo ret1 = new Retangulo();
        Retangulo ret2 = new Retangulo();
        System.out.println("Area do Retangulo padrão " + ret1.getArea() + ". Perimetro é " + ret1.getPerimetro()
                + ". Cor é " + ret1.getCor());

        ret2.setAltura(5);
        ret2.setLargura(3);
        ret2.setCor("Azul");
        System.out.println("Area Retangulo novo " + ret2.getArea());
        System.out.println("Perimetro Retangulo novo " + ret2.getPerimetro());
        System.out.println("Cor Retangulo novo " + ret2.getCor());

    }

}
