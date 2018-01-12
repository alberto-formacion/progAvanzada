import { Component, OnInit } from '@angular/core';
import { ArticuloService } from '../services/articulo.service';
import { Http } from '@angular/http';

@Component({
  selector: 'app-articulo',
  templateUrl: './articulo.component.html',
  styleUrls: ['./articulo.component.css'],
  providers: [ArticuloService]
})
export class ArticuloComponent implements OnInit {

  public articulos;

  constructor(
    private _articuloService: ArticuloService
  ) { }

  ngOnInit() {
    this._articuloService.getArticulos().subscribe(
      articulos =>{
        this.articulos = articulos;
      },
      error => {
        console.log(error);
      }
    );
  }

}
