import { Component, OnInit } from '@angular/core';
import { Todo } from './todo';

@Component({
  selector: 'app-todo',
  templateUrl: './todo.component.html',
  styleUrls: ['./todo.component.css']
})
export class TodoComponent implements OnInit {

  public todos: Array<Todo>;
  public nombreTodo: string;

  constructor() { }

  ngOnInit() {
    this.todos = [
      new Todo('Tarea1', false, false),
      new Todo('Tarea2', false, false),
      new Todo('Tarea3', false, false),
      new Todo('Tarea4', false, false),
      new Todo('Tarea5', false, false)
    ];
  }

  addTodo() {
    const todoNuevo = new Todo(this.nombreTodo, false, false);
    this.todos.push(todoNuevo);
  }

}
