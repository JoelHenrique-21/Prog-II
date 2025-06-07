// ConversorUnidadesMoedas.java

class ConversorTemperatura {
    public double celsiusParaFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }
    public double celsiusParaKelvin(double c) {
        return c + 273.15;
    }
    public double fahrenheitParaCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
    public double kelvinParaCelsius(double k) {
        return k - 273.15;
    }
}

class ConversorComprimento {
    public double metrosParaCentimetros(double m) {
        return m * 100;
    }
    public double metrosParaMilimetros(double m) {
        return m * 1000;
    }
    public double metrosParaPolegadas(double m) {
        return m * 39.3701;
    }
    public double metrosParaPes(double m) {
        return m * 3.28084;
    }
}

class ConversorMassa {
    public double kgParaGramas(double kg) {
        return kg * 1000;
    }
    public double kgParaLibras(double kg) {
        return kg * 2.20462;
    }
    public double librasParaKg(double lb) {
        return lb / 2.20462;
    }
}

class ConversorMoeda {
    private double cotacaoDolar = 5.30;
    private double cotacaoEuro = 5.70;
    private double cotacaoLibra = 6.50;

    public double realParaDolar(double real) {
        return real / cotacaoDolar;
    }
    public double realParaEuro(double real) {
        return real / cotacaoEuro;
    }
    public double realParaLibra(double real) {
        return real / cotacaoLibra;
    }
    public double dolarParaReal(double dolar) {
        return dolar * cotacaoDolar;
    }
}

public class ConversorUnidadesMoedas {
    public static void main(String[] args) {
        ConversorTemperatura temp = new ConversorTemperatura();
        ConversorComprimento comp = new ConversorComprimento();
        ConversorMassa massa = new ConversorMassa();
        ConversorMoeda moeda = new ConversorMoeda();

        System.out.println("25°C em Fahrenheit: " + temp.celsiusParaFahrenheit(25));
        System.out.println("1 metro em polegadas: " + comp.metrosParaPolegadas(1));
        System.out.println("70kg em libras: " + massa.kgParaLibras(70));
        System.out.println("100 reais em dólares: " + moeda.realParaDolar(100));
    }
}
