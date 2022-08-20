package com.countrylistmanager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    private static final String COMMA_DELIMITER = ",";

    public static void main(String[] args) {
        testOriginalData();
        testSortIncreasingByPopulation();
        testSortDecreasingByPopulation();
        testFilterContinent("NGA");
        testFilterLeastPopulousCountries(1000);
        testSortDecreasingByArea();
        testSortDecreasingByPopulation();
        testSortIncreasingByPopulation();
        /* TODO */
        // Viết code cho các hàm test.
        // Kết quả chạy chương trình lưu vào file <Mã số sinh viên>CountryListManager.txt và nộp cùng source code.
    }

    public static void readListData(String filePath) {
        BufferedReader dataReader = null;
        try {
            String line;
            //dataReader = new BufferedReader(new FileReader("data/nations1.csv"));
            dataReader = new BufferedReader(new FileReader(filePath));
            // How to read file in java line by line?
            while ((line = dataReader.readLine()) != null) {
                List<String> dataList = parseDataLineToList(line);
                if (dataList.size() != 6) {
                    continue;
                }

                if (dataList.get(0).equals("code")) {
                    continue;
                }

                CountryData newCountryData = new CountryData.CountryDataBuilder(dataList.get(0))
                        .setName(dataList.get(1))
                        .setPopulation(Integer.parseInt(dataList.get(2)))
                        .setArea(Double.parseDouble(dataList.get(3)))
                        .setGdp(Double.parseDouble(dataList.get(4)))
                        .build();

                AbstractCountry country = CountryFactory.getInstance().createCountry(newCountryData.getName(), newCountryData);
                CountryListManager.getInstance().append(country);;
                /* TODO */
                // Tạo đối tượng Country sử dụng CountryFactory,
                // sau đó cho vào CountryListManager để quản lý.
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (dataReader != null)
                    dataReader.close();
            } catch (IOException crunchifyException) {
                crunchifyException.printStackTrace();
            }
        }
    }

    public static List<String> parseDataLineToList(String dataLine) {
        List<String> result = new ArrayList<String>();
        if (dataLine != null) {
            String[] splitData = dataLine.split(COMMA_DELIMITER);
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    public static String[] parseDataLineToArray(String dataLine) {
        if (dataLine == null) {
            return null;
        }

        return dataLine.split(COMMA_DELIMITER);
    }

    public static void init() {
        String filePath = "D:/Java Test/src/com/data/countries2.csv";
        readListData(filePath);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testOriginalData() {
        init();
        System.out.println("Code cac nuoc:");
        String codes = "[";
        for(int i = 0; i < CountryListManager.getInstance().getCountryList().size(); i++) {
            codes += CountryListManager.getInstance().getCountryList().get(i).getCode();
            if(i < CountryListManager.getInstance().getCountryList().size()) {
                codes += " ";
            } 
        }
        codes += "]";
        System.out.println(codes);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortIncreasingByPopulation() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortIncreasingByPopulation();
        System.out.println("Code cac nuoc theo thu tu teang dan dan so");
        String codeString = "[";
        for(int i = 0; i < countries.size(); i++) {
            codeString += countries.get(i).getCode();
            if(i < countries.size()) {
                codeString += " ";
            }
        }
        codeString += "]";
        System.out.println(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortDecreasingByPopulation() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortDecreasingByPopulation();
        String codeString = "[";
        System.out.println("Code cac nuoc theo thu tu giam dan dan so");
        for(int i = 0; i < countries.size(); i++) {
            codeString += countries.get(i).getCode();
            if(i < countries.size()) {
                codeString += " ";
            }
        }
        codeString += "]";
        System.out.println(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortIncreasingByArea() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortIncreasingByArea();
        String codeString = "[";
        System.out.println("Code cac nuoc theo thu tu taang dan dien tich");
        for(int i = 0; i < countries.size(); i++) {
            codeString += countries.get(i).getCode();
            if(i < countries.size()) {
                codeString += " ";
            }
        }
        codeString += "]";
        System.out.println(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortDecreasingByArea() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortDecreasingByArea();
        String codeString = "[";
        System.out.println("Code cac nuoc theo thu tu giam dan dien tich");
        for(int i = 0; i < countries.size(); i++) {
            codeString += countries.get(i).getCode();
            if(i < countries.size()) {
                codeString += " ";
            }
        }
        codeString += "]";
        System.out.println(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortIncreasingByGdp() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortIncreasingByGdp();
        String codeString = "[";
        System.out.println("Code cac nuoc theo thu tu tang dan DGP");
        for(int i = 0; i < countries.size(); i++) {
            codeString += countries.get(i).getCode();
            if(i < countries.size()) {
                codeString += " ";
            }
        }
        codeString += "]";
        System.out.println(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testSortDecreasingByGdp() {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().sortDecreasingByGdp();
        String codeString = "[";
        System.out.println("Code cac nuoc theo thu tu tang dan DGP");
        for(int i = 0; i < countries.size(); i++) {
            codeString += countries.get(i).getCode();
            if(i < countries.size()) {
                codeString += " ";
            }
        }
        codeString += "]";
        System.out.println(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testFilterMostPopulousCountries(int howMany) {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterMostPopulousCountries(howMany);
        String codeString = "[";
        System.out.println("Code cac nuoc dong dan nhat");
        for(int i = 0; i < countries.size(); i++) {
            codeString += countries.get(i).getCode();
            if(i < countries.size()) {
                codeString += " ";
            }
        }
        codeString += "]";
        System.out.println(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR ITA ARG DZA CAN AUS KAZ SGP DNK NLD ESP SWE THA UKR VNM CHE QAT NZL]
    public static void testFilterLeastPopulousCountries(int howMany) {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterLeastPopulousCountries(howMany);
        String codeString = "[";
        System.out.println("Code cac nuoc it dan nhat");
        for(int i = 0; i < countries.size(); i++) {
            codeString += countries.get(i).getCode();
            if(i < countries.size()) {
                codeString += " ";
            }
        }
        codeString += "]";
        System.out.println(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    public static void testFilterContinent(String continent) {
        init();
        List<AbstractCountry> countries = CountryListManager.getInstance().filterContinent(continent);
        String codeString = "[";
        System.out.println("Code cac nuoc dung ten");
        for(int i = 0; i < countries.size(); i++) {
            codeString += countries.get(i).getCode();
            if(i < countries.size()) {
                codeString += " ";
            }
        }
        codeString += "]";
        System.out.println(codeString);
    }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    // public static void testFilterMostPopulousCountries() {
        
    // }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    // public static void testFilterLeastPopulousCountries() {
    //     /* TODO */
    // }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    // public static void testFilterLargestAreaCountries() {
    //     /* TODO */
    // }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    // public static void testFilterSmallestAreaCountries() {
    //     /* TODO */
    // }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    // public static void testFilterHighestGdpCountries() {
    //     /* TODO */
    // }

    // In ra code của các nước theo định dạng, ví dụ
    // [CHN IND USA IDN BRA PAK NGA BGD RUS MEX JPN DEU FRA GBR]
    // public static void testFilterLowestGdpCountries() {
    //     /* TODO */
    // }

}
