package Actividad4.ClaseAbstracta;

public class Fraccion extends Numerica {
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.numerador = numerador;
        if (denominador != 0) {
            this.denominador = denominador;
        } else {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
    }

    @Override
    public String toString() {
        return numerador + "/" + denominador;
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) {
            return true;
        }
        if (ob == null || getClass() != ob.getClass()) {
            return false;
        }
        Fraccion otra = (Fraccion) ob;
        return numerador == otra.numerador && denominador == otra.denominador;
    }

    @Override
    public Numerica sumar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otra = (Fraccion) numero;
            int nuevoNumerador = (this.numerador * otra.denominador) + (otra.numerador * this.denominador);
            int nuevoDenominador = this.denominador * otra.denominador;
            return simplificarFraccion(new Fraccion(nuevoNumerador, nuevoDenominador));
        } else {
            throw new IllegalArgumentException("La suma solo es compatible con fracciones.");
        }
    }

    @Override
    public Numerica restar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otra = (Fraccion) numero;
            int nuevoNumerador = (this.numerador * otra.denominador) - (otra.numerador * this.denominador);
            int nuevoDenominador = this.denominador * otra.denominador;
            return simplificarFraccion(new Fraccion(nuevoNumerador, nuevoDenominador));
        } else {
            throw new IllegalArgumentException("La resta solo es compatible con fracciones.");
        }
    }

    @Override
    public Numerica multiplicar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otra = (Fraccion) numero;
            int nuevoNumerador = this.numerador * otra.numerador;
            int nuevoDenominador = this.denominador * otra.denominador;
            return simplificarFraccion(new Fraccion(nuevoNumerador, nuevoDenominador));
        } else {
            throw new IllegalArgumentException("La multiplicacion solo es compatible con fracciones.");
        }
    }

    @Override
    public Numerica dividir(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion otra = (Fraccion) numero;
            int nuevoNumerador = this.numerador * otra.denominador;
            int nuevoDenominador = this.denominador * otra.numerador;
            if (nuevoDenominador == 0) {
                throw new ArithmeticException("No se puede dividir por cero.");
            }
            return simplificarFraccion(new Fraccion(nuevoNumerador, nuevoDenominador));
        } else {
            throw new IllegalArgumentException("La division solo es compatible con fracciones.");
        }
    }

    // Metodo auxiliar para simplificar una fraccion
    private Fraccion simplificarFraccion(Fraccion fraccion) {
        int gcd = gcd(fraccion.numerador, fraccion.denominador);
        return new Fraccion(fraccion.numerador / gcd, fraccion.denominador / gcd);
    }

    // Metodo auxiliar para calcular el maximo comun divisor (GCD)
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
