package ua.epam.model;

public enum Product {
    bred{
        @Override
        public String getBarcode() {
            return "001";
        }
    },
    roll{
        @Override
        public String getBarcode() {
            return "002";
        }
    },
    cookie{
        @Override
        public String getBarcode() {
            return "003";
        }
    };


    public String getBarcode(){
        return "000";
    };
}
