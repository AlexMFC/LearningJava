package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private static SimpleDateFormat fmt1 = new SimpleDateFormat("dd/MM/yyyy");
	private static SimpleDateFormat fmt2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private OrderStatus status;
	
	List<OrderItem> orderItens = new ArrayList<>();
	Client client = new Client();
	

	public Order() {
		
	}
	
	public Order(Client client, Date moment, OrderStatus status) {
		this.client = client;
		this.moment = moment;
		this.status = status;
	}
	
	public Double total() {
		double total = 0;
		for (OrderItem itens : orderItens) {
			total += itens.subTotal();
		}
		return total;
	}

	public void addItem(OrderItem item) {
		orderItens.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderItens.remove(item);
	}
	
	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public String toString() {
		StringBuilder summary = new StringBuilder();
		summary.append("ORDER SUMMARY: \n");
		summary.append("Order moment: " + fmt2.format(this.getMoment()) + "\n");
		summary.append("Order status:" + this.getStatus() + "\n");
		summary.append("Client: " + client.getName() + " (" + fmt1.format(client.getBirthDate()) + ") " + client.getEmail() +"\n");
		summary.append("Order itens: \n");
		for (OrderItem itens : orderItens) {
			summary.append(itens.getProduct().getName() + ", $" + itens.getProduct().getPrice() 
							+ ", Quantity:" + itens.getQuantity() + ", Subtotal: " + itens.subTotal() +"\n");
		}
		summary.append("Total price: $" + this.total());
		
		
		return summary.toString();
	}
	
}
