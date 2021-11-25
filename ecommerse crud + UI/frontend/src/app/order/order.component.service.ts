import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private baseUrl = 'http://localhost:8080/order';

  constructor(private http: HttpClient) { }

  getOrder(ord_id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${ord_id}`);
  }
      
  createOrder(order: Object): Observable<Object> {
    return this.http.post(`${this.baseUrl}`, order);
  }

  

  deleteOrder(ord_id: number): Observable<any> {
    return this.http.delete(`${this.baseUrl}/${ord_id}`, { responseType: 'text' });
  }
      //this method is to get list of all values
  getOrderList(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
}
