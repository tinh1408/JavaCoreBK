package com.dtv.nganhang;

class GiaoDichVang extends GiaoDich
{
    private String LoaiVang;
    public GiaoDichVang()
    {
        super();
        this.LoaiVang="";
    }
    public GiaoDichVang(int ma, int sl, String ngay, double dgia, double ttien,
                        String lvang)
    {
        super(ma, sl, ngay, dgia, ttien);
        this.LoaiVang=lvang;
    }
    public String getLoaiVang() {
        return LoaiVang;
    }
    public void setLoaiVang(String loaiVang) {
        LoaiVang = loaiVang;
    }
    public void nhap()
    {
        super.nhap();
        System.out.println("Loai Vang: ");
        LoaiVang = in.next();
    }
    public double TTien()
    {
        return this.ThanhTien=this.DonGia*this.SoLuong;
    }
    public String toString()
    {
        return "Giao Dich Vang: " + super.toString() + ", LoaiVang: " +
                LoaiVang
                + ", ThanhTien: " + ThanhTien + "]";
    }
}

class GiaoDichTienTe extends GiaoDich
{
    private float TiGia;
    private int LoaiTienTe;
    public GiaoDichTienTe()
    {
        super();
        this.TiGia=0;
        this.LoaiTienTe=0;
    }
    public GiaoDichTienTe(int ma, int sl, String ngay, double dgia, double
            ttien, float tgia, int loai)
    {
        super(ma, sl, ngay, dgia, ttien);
        this.TiGia=tgia;
        this.LoaiTienTe=loai;
    }
    public float getTiGia() {
        return TiGia;
    }
    public void setTiGia(float tiGia) {
        TiGia = tiGia;
    }
    public int getLoaiTienTe() {
        return LoaiTienTe;
    }
    public void setLoaiTienTe(int loaiTienTe) {
        LoaiTienTe = loaiTienTe;
    }
    public void nhap()
    {
        super.nhap();
        System.out.println("Ti Gia: ");
        TiGia=in.nextFloat();
        System.out.println("Loai Tien Te: ");
        LoaiTienTe=in.nextInt();
    }
    public double TTien()
    {
        if(LoaiTienTe==1)
            return this.ThanhTien=this.DonGia*this.SoLuong;
        else
            return this.ThanhTien=this.DonGia*this.SoLuong*this.TiGia;
    }
    public String toString()
    {
        String temp;
        if(LoaiTienTe==1)
            temp="VND";
        else if(LoaiTienTe==2)
            temp="USD";
        else
            temp="EURO";
        return "Giao Dich Tien Te: " + super.toString() + "' Ti Gia: " + TiGia
                + ", Loai Tien Te: " + temp + ", ThanhTien: " + ThanhTien +
                "]";
    }
}