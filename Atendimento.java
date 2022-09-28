public class Atendimento {
 private Cliente cliente;
 private int data;
 private String serviço; // não sei como fazer lista ainda
 private Cabelereiro cabelereiro;
 Serviço s = new Serviço();
 public Cliente getCliente() {
	return cliente;
 }

 public void setCliente(Cliente cliente) {
	this.cliente = cliente;
 }

 public int getData() {
	return data;
 }

 public void setData(int data) {
	this.data = data;
 }

 public String getServiço() {
	return serviço;
 }

 public void setServiço(String serviço) {
	this.serviço = serviço;
 }

 public Cabelereiro getCabelereiro() {
	return cabelereiro;
 }

 public void setCabelereiro(Cabelereiro cabelereiro) {
	this.cabelereiro = cabelereiro;
 }

	}

