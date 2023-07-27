package com.bolsadeideas.springboot.di.app.models.domain;

public class ItemFactura {
	private Producto producto;
	private Integer cantidad;
	
	public ItemFactura(Producto producto, Integer cantidad) {
		
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Integer getCantida() {
		return cantidad;
	}
	public void setCantida(Integer cantidad) {
		this.cantidad = cantidad;
	}
	 public Integer calcularImporte() {
		 return cantidad * producto.getPrecio();
	 }

	
}
