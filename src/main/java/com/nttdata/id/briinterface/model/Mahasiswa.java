package com.nttdata.id.briinterface.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import javax.validation.constraints.*;

@JacksonXmlRootElement(localName = "Mahasiswa")
public class Mahasiswa {

    @NotBlank(message = "Nama is mandatory")
    @Size(min = 1, max = 10, message = "Nama must be between 1 and 10 characters")
    private String nama;

    @NotBlank(message = "NIM is mandatory")
    @Size(min = 1, max = 8, message = "NIM must be between 1 and 8 characters")
    private String nim;

    @NotBlank(message = "Jenis Kelamin is mandatory")
    @Size(min = 1, max = 5, message = "Jenis Kelamin must be between 1 and 5 characters")
    private String jenisKelamin;

    @NotBlank(message = "Tanggal Lahir is mandatory")
    private String tanggalLahir;

    private Double tinggiBadan;

    private Double beratBadan;

    @Size(max = 10, message = "Nama Orang Tua must be a maximum of 10 characters")
    private String namaOrangTua;

    // Getters and Setters
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }

    public Double getTinggiBadan() {
        return tinggiBadan;
    }

    public void setTinggiBadan(Double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }

    public Double getBeratBadan() {
        return beratBadan;
    }

    public void setBeratBadan(Double beratBadan) {
        this.beratBadan = beratBadan;
    }

    public String getNamaOrangTua() {
        return namaOrangTua;
    }

    public void setNamaOrangTua(String namaOrangTua) {
        this.namaOrangTua = namaOrangTua;
    }
}