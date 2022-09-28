import java.util.Scanner;
import java.util.Calendar;
public class teste {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Calendar c = Calendar.getInstance();
		//quando for dar espaço nas descrições, coloque _ ou vai dar erro, não sei fazer vetor em objeto ainda.
		//não está ao pé da letra como foi pedido mas foi o máximo que consegui fazer.
		Cliente cliente1 = new Cliente();
		System.out.println("Informações do cliente 1,id:");
		cliente1.setId(leitor.nextInt());
		System.out.println("Informações do cliente 1,nome:");
		cliente1.setNome(leitor.next());
		System.out.println("Informações do cliente 1,Cpf:");
		cliente1.setCPF(leitor.next());
		
		Cliente cliente2 = new Cliente();
		System.out.println("Informações do cliente 2,id:");
		cliente2.setId(leitor.nextInt());
		System.out.println("Informações do cliente 2,nome:");
		cliente2.setNome(leitor.next());
		System.out.println("Informações do cliente 2,Cpf:");
		cliente2.setCPF(leitor.next());
		
		Cliente cliente3 = new Cliente();
		System.out.println("Informações do cliente 3,id:");
		cliente3.setId(leitor.nextInt());
		System.out.println("Informações do cliente 2,nome:");
		cliente3.setNome(leitor.next());
		System.out.println("Informações do cliente 2,Cpf:");
		cliente3.setCPF(leitor.next());
		
		
		Cabelereiro cabelereiro1 = new Cabelereiro();
		System.out.println("Informações do cabelereiro 1,id:");
		cabelereiro1.setId(leitor.nextInt());
		System.out.println("Informações do cabelereiro 1,nome:");
		cabelereiro1.setNome(leitor.next());
		System.out.println("Informações do cabelereiro 1,CPF:");
		cabelereiro1.setCPF(leitor.next());
		
		Cabelereiro cabelereiro2 = new Cabelereiro();
		System.out.println("Informações do cabelereiro 2,id:");
		cabelereiro2.setId(leitor.nextInt());
		System.out.println("Informações do cabelereiro 2,nome:");
		cabelereiro2.setNome(leitor.next());
		System.out.println("Informações do cabelereiro 2,CPF:");
		cabelereiro2.setCPF(leitor.next());
		
		Cabelereiro cabelereiro3 = new Cabelereiro();
		System.out.println("Informações do cabelereiro 3,id:");
		cabelereiro3.setId(leitor.nextInt());
		System.out.println("Informações do cabelereiro 3,nome:");
		cabelereiro3.setNome(leitor.next());
		System.out.println("Informações do cabelereiro 3,CPF:");
		cabelereiro3.setCPF(leitor.next());
		
		Serviço serviço1 = new Serviço();
		System.out.println("Informações do serviço, id:");
		serviço1.setId(leitor.nextInt());
		System.out.println("Informações do serviço, nome do serviço:");
		serviço1.setNome(leitor.next());
		System.out.println("Informações do serviço, valor:");
		serviço1.setValor(leitor.nextFloat());
		System.out.println("Informações do serviço, descrição:");
		serviço1.setDescriçao(leitor.next());
		
		Serviço serviço2 = new Serviço();
		System.out.println("Informações do serviço, id:");
		serviço2.setId(leitor.nextInt());
		System.out.println("Informações do serviço, nome do serviço:");
		serviço2.setNome(leitor.next());
		System.out.println("Informações do serviço, valor:");
		serviço2.setValor(leitor.nextFloat());
		System.out.println("Informações do serviço, descrição:");
		serviço2.setDescriçao(leitor.next());
		
		Serviço serviço3 = new Serviço();
		System.out.println("Informações do serviço, id:");
		serviço3.setId(leitor.nextInt());
		System.out.println("Informações do serviço, nome do serviço:");
		serviço3.setNome(leitor.next());
		System.out.println("Informações do serviço, valor:");
		serviço3.setValor(leitor.nextFloat());
		System.out.println("Informações do serviço, descrição:");
		serviço3.setDescriçao(leitor.next());
		
		Agendamento agendamentoc1 = new Agendamento();
		System.out.println("Informações do agendamento, id:");
		agendamentoc1.setId(leitor.nextInt());
		System.out.println("Informações do agendamento, data:");
		agendamentoc1.setData(c.get(Calendar.DAY_OF_MONTH));
		agendamentoc1.setCliente(cliente1);
		System.out.println("Informações do agendamento, hora:"); // não consegui usar o calendar na hora e no minuto.
		agendamentoc1.setHora(c.get(Calendar.HOUR_OF_DAY));
		System.out.println("Informações do agendamento, minuto:");
		agendamentoc1.setMinuto(c.get(Calendar.MINUTE));
		
		Agendamento agendamentoc2 = new Agendamento();
		System.out.println("Informações do agendamento, id:");
		agendamentoc2.setId(leitor.nextInt());
		System.out.println("Informações do agendamento, data:");
		agendamentoc2.setData(c.get(Calendar.DAY_OF_MONTH));
		agendamentoc2.setCliente(cliente2);
		System.out.println("Informações do agendamento, hora:"); // não consegui usar o calendar na hora e no minuto.
		agendamentoc2.setHora(c.get(Calendar.HOUR_OF_DAY));
		System.out.println("Informações do agendamento, minuto:");
		agendamentoc2.setMinuto(c.get(Calendar.MINUTE));
		
		Agendamento agendamentoc3 = new Agendamento();
		System.out.println("Informações do agendamento, id:");
		agendamentoc3.setId(leitor.nextInt());
		System.out.println("Informações do agendamento, data:");
		agendamentoc3.setData(c.get(Calendar.DAY_OF_MONTH));
		agendamentoc3.setCliente(cliente3);
		System.out.println("Informações do agendamento, hora:"); // não consegui usar o calendar na hora e no minuto.
		agendamentoc3.setHora(c.get(Calendar.HOUR_OF_DAY));
		System.out.println("Informações do agendamento, minuto:");
		agendamentoc3.setMinuto(c.get(Calendar.MINUTE));
		
		Atendimento atendimento1 = new Atendimento();
		System.out.println("Informações do Atendimento");
		atendimento1.setCliente(cliente1);
		atendimento1.setData(c.get(Calendar.DAY_OF_MONTH));
		atendimento1.setServiço(serviço1.getNome());
		atendimento1.setCabelereiro(cabelereiro1);
		
		Atendimento atendimento2 = new Atendimento();
		System.out.println("Informações do Atendimento");
		atendimento2.setCliente(cliente1);
		atendimento2.setData(c.get(Calendar.DAY_OF_MONTH));
		atendimento2.setServiço(serviço2.getNome());
		atendimento2.setCabelereiro(cabelereiro2);
		
		Atendimento atendimento3 = new Atendimento();
		System.out.println("Informações do Atendimento");
		atendimento3.setCliente(cliente1);
		atendimento3.setData(c.get(Calendar.DAY_OF_MONTH));
		atendimento3.setServiço(serviço3.getNome());
		atendimento3.setCabelereiro(cabelereiro3);
		
		System.out.println("O primeiro cliente chamado: " + cliente1.getNome() + " de id: "+ cliente1.getId()+ " de cpf: " + cliente1.getCPF()+ " foi atendido pelo cabelereiro: " + cabelereiro1.getNome() + " de id: " + cabelereiro1.getId() + " que possui o cpf: " + cabelereiro1.getCPF());
		System.out.println("Esse cliente pediu o serviço de id : "+ serviço1.getId() + " que é chamado de: " + serviço1.getNome() + " e consiste em: "+ serviço1.getDescriçao() + ", "+ serviço1.getValor() + " foi o preço pago pelo cliente.");
		System.out.println("Folha de atendimento do primeiro cliente:");
		System.out.println(atendimento1.getCliente().getNome());
		System.out.println("Data do atendimento: "+ atendimento1.getData());
		System.out.println("Serviço prestado: " + atendimento1.getServiço());
		System.out.println("Cabelereiro responsável: "+ atendimento1.getCabelereiro().getNome());
		
		System.out.println("O segundo cliente chamado: " + cliente2.getNome() + " de id: "+ cliente2.getId()+ " de cpf: " + cliente2.getCPF()+ " foi atendido pelo cabelereiro: " + cabelereiro2.getNome() + " de id: " + cabelereiro2.getId() + " que possui o cpf: " + cabelereiro2.getCPF());
		System.out.println("Esse cliente pediu o serviço de id : "+ serviço2.getId() + " que é chamado de: " + serviço2.getNome() + " e consiste em: "+ serviço2.getDescriçao() + ", "+ serviço2.getValor() + " foi o preço pago pelo cliente.");
		System.out.println("Folha de atendimento do segundo cliente:");
		System.out.println(atendimento2.getCliente().getNome());
		System.out.println("Data do atendimento: "+ atendimento2.getData());
		System.out.println("Serviço prestado: " + atendimento2.getServiço());
		System.out.println("Cabelereiro responsável: "+ atendimento2.getCabelereiro().getNome());
		
		System.out.println("O terceiro cliente chamado: " + cliente3.getNome() + " de id: "+ cliente3.getId()+ " de cpf: " + cliente3.getCPF()+ " foi atendido pelo cabelereiro: " + cabelereiro3.getNome() + " de id: " + cabelereiro3.getId() + " que possui o cpf: " + cabelereiro3.getCPF());
		System.out.println("Esse cliente pediu o serviço de id : "+ serviço3.getId() + " que é chamado de: " + serviço3.getNome() + " e consiste em: "+ serviço3.getDescriçao() + ", "+ serviço3.getValor() + " foi o preço pago pelo cliente.");
		System.out.println("Folha de atendimento do terceiro cliente:");
		System.out.println(atendimento3.getCliente().getNome());
		System.out.println("Data do atendimento: "+ atendimento3.getData());
		System.out.println("Serviço prestado: " + atendimento3.getServiço());
		System.out.println("Cabelereiro responsável: "+ atendimento3.getCabelereiro().getNome());
		leitor.close();
	}

}
