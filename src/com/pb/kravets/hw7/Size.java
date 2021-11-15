package com.pb.kravets.hw7;

public enum Size{
    XXS,
    XS,
    S,
    M,
    L;

    String description;
    int euroSize;

    Size() {
        this.description = description;
        this.euroSize = euroSize;
    }

    public String getDescription(Size typeSize){
        if (typeSize==XXS){
            return "Детский размер.";
        } else {
            return "Взрослый размер.";
        }
    }

    public int getEvroSize (Size typeSize){
        switch (typeSize){
            case XXS:
                return 32;
            case XS:
                return 34;

            case S:
                return 36;

            case M:
                return 38;

            case L:
                return 40;

        }
        return  0;
    }
}
