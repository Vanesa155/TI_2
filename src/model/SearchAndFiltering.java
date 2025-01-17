package model;

import ui.Main;

public class SearchAndFiltering {
    Insert insert = new Insert();

    public void filter(int search){
        int filter;

        switch (search){
            case 1:
                System.out.println("Has seleccionado paises");
                System.out.println("Ingrese la poblacion que desea buscar dentro de la lista de paises");
                filter = Main.sc.nextInt();

                filterCountries(filter);
                break;

            case 2:
                System.out.println("Has seleccionado ciudades");
                System.out.println("Ingrese la poblacion que desea buscar dentro de la lista de ciudades");
                filter = Main.sc.nextInt();

                filterCities(filter);
                break;

            default:
                System.out.println("Ingrese un número válido");
        }
    }

    public int filterCountries(int requesPopulation){
        //traer la lista --> también crear una lista temp para guardar los datos de la póblacion y repartirlos
        //buscar pais por poblacion



        //Se necesita hallar a un pais por su poblacion
        int left = 0;
        int right = insert.countries.size() - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if (insert.countries.get(mid).getPopulation() < requesPopulation){
                right = mid - 1;
            } else if (requesPopulation > insert.countries.get(mid).getPopulation()) { // Debe ser una lista de numeros porque lo esta preguntando por un numero exacto
                left = mid + 1;
            } else {
                return mid;
            }
            return -1;
        }

        return left;
    }

    public int filterCities(int requesPopulation){

        //Se necesita hallar a un pais por su poblacion
        int left = 0;
        int right = insert.cities.size() - 1;

        while (left <= right){
            int mid = left + (right - left) / 2;
            if (insert.cities.get(mid).getPopulationCity() > requesPopulation){
                right = mid - 1;
            } else if (requesPopulation > insert.cities.get(mid).getPopulationCity()) { // Debe ser una lista de numeros porque lo esta preguntando por un numero exacto
                left = mid + 1;
            } else {
                return mid;
            }
            return -1;
        }

        return left;
    }




}
