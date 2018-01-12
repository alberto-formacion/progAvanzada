import { Injectable } from '@angular/core';
import { Http, Response, Headers } from '@angular/http';
import 'rxjs/add/operator/map';
import { Observable } from 'rxjs/Observable';
import { Articulo } from '../articulo/articulo';

@Injectable()
export class ArticuloService {
  public url: string;

  constructor(private _http:Http) { 
    this.url = "https://jsonplaceholder.typicode.com/posts";
  }

  getArticulos(): Observable<Array<Articulo>>{
    return this._http.get(this.url)
          .map(articulos => articulos.json().map(articulo => {
            return new Articulo(articulo.userId, articulo.id, articulo.title, articulo.body);
          }));
    //return this._http.get(this.url).map(function(articulos){articulos.json()});
  }

}
