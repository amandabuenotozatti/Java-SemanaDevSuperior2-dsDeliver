import { useEffect } from "react";

type Props = {
    message: string;
  }
  
  function Hello({message}: Props) {
    useEffect (() => {
        //chamada para a API para buscar os produtos
    }, );
    //é uma função que recebe dois parâmetros
    //o primeiro parâmetro é uma função -arrow function 
    //e o segundo parâmetro é uma lista de dependências

    return (
      <h1>Hello {message}!</h1>
    );
  }
  
  export default Hello;
  