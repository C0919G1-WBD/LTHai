package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    }
    public static String[] ChuSo= {" không "," một "," hai "," ba "," bốn "," năm "," sáu "," bảy "," tám "," chín "};
    public static String[] Tien= { "", " nghìn", " triệu", " tỷ", " nghìn tỷ", " triệu tỷ"};

    public static String read(int num) {

        int tram;
        int chuc;
        int donvi;
        String KetQua = "";

        tram = num / 100;
        chuc = (num % 100) / 10;
        donvi = num % 10;
        if(tram==0 && chuc==0 && donvi==0){
            return "không";
        }
        if(tram!=0)
        {
            KetQua += ChuSo[tram] + " trăm ";
            if ((chuc == 0) && (donvi != 0)) KetQua += " linh ";
        }
        if ((chuc != 0) && (chuc != 1))
        {
            KetQua += ChuSo[chuc] + " mươi";
            if ((chuc == 0) && (donvi != 0)) KetQua = KetQua + " linh ";
        }
        if (chuc == 1) KetQua += " mười ";
        switch (donvi)
        {
            case 1:
                if ((chuc != 0) && (chuc != 1))
                {
                    KetQua += " mốt ";
                }
                else
                {
                    KetQua += ChuSo[donvi];
                }
                break;
            case 5:
                if (chuc == 0)
                {
                    KetQua += ChuSo[donvi];
                }
                else
                {
                    KetQua += " lăm ";
                }
                break;
            default:
                if (donvi != 0)
                {
                    KetQua += ChuSo[donvi];
                }
                break;
        }

        return KetQua;
    }

    public static String DocTienBangChu(double SoTien)
    {
        double lan=0;
        double i=0;
        double so=0;
        String KetQua="";
        String tmp="";
        String[] ViTri = new String[10];
        if(SoTien<0) return "Số tiền âm !";
        if(SoTien==0) return "Không đồng !";
        if(SoTien>0)
        {
            so=SoTien;
        }
        else
        {
            so = -SoTien;
        }
        if (SoTien > 899999999)
        {
            //SoTien = 0;
            return "Số quá lớn!";
        }
        ViTri[5] = Math.floor(so / 1000000000);
        if(isNaN(ViTri[5]))
            ViTri[5] = "0";
        so = so - parseFloat(ViTri[5].toString()) * 1000000000;
        ViTri[4] = Math.floor(so / 1000000000);
        if(isNaN(ViTri[4]))
            ViTri[4] = "0";
        so = so - parseFloat(ViTri[4].toString()) * 1000000000;
        ViTri[3] = Math.floor(so / 1000000000);
        if(isNaN(ViTri[3]))
            ViTri[3] = "0";
        so = so - parseFloat(ViTri[3].toString()) * 1000000000;
        ViTri[2] = parseInt(so / 1000000);
        if(isNaN(ViTri[2]))
            ViTri[2] = "0";
        ViTri[1] = parseInt((so % 1000000) / 1000);
        if(isNaN(ViTri[1]))
            ViTri[1] = "0";
        ViTri[0] = parseInt(so % 1000);
        if(isNaN(ViTri[0]))
            ViTri[0] = "0";
        if (ViTri[5] > 0)
        {
            lan = 5;
        }
        else if (ViTri[4] > 0)
        {
            lan = 4;
        }
        else if (ViTri[3] > 0)
        {
            lan = 3;
        }
        else if (ViTri[2] > 0)
        {
            lan = 2;
        }
        else if (ViTri[1] > 0)
        {
            lan = 1;
        }
        else
        {
            lan = 0;
        }
        for (i = lan; i >= 0; i--)
        {
            tmp = DocSo3ChuSo(ViTri[i]);
            KetQua += tmp;
            if (ViTri[i] > 0) KetQua += Tien[i];
            if ((i > 0) && (tmp.length > 0)) KetQua += ',';//&& (!string.IsNullOrEmpty(tmp))
        }
        if (KetQua.substring(KetQua.length - 1) == ',')
        {
            KetQua = KetQua.substring(0, KetQua.length - 1);
        }
        KetQua = KetQua.substring(1,2).toUpperCase()+ KetQua.substring(2);
        return KetQua;//.substring(0, 1);//.toUpperCase();// + KetQua.substring(1);
    }
}
