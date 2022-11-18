async function registrar() {
    let datos ={};
    datos.nombre= document.getElementById('nombre').value;
    if(document.getElementById('cedula').value.length<7){
    alert("Documento no valido");
    return;
    }else{
    datos.cedula= document.getElementById('cedula').value;
    }
    if(document.getElementById('telefono').value.length<10 || document.getElementById('telefono').value.length >10 ){
    alert("Telefono no valido");
    }else{
    datos.telefono= document.getElementById('telefono').value;
    }
    datos.direccion= document.getElementById('direccion').value;
    if(document.getElementById('edad').value<18){
          alert("Edad Minima Permitida: 18 anos");
          return;
    }else{
    datos.edad= document.getElementById('edad').value;
    }

    datos.correo= document.getElementById('correo').value;
    if(document.getElementById('password').value.length <5 ){
            alert("Minimo 6 caracteres");
            return;
    }else{
    datos.contrasena= document.getElementById('password').value;
    }
    let repetirpassword=document.getElementById('passwordrep').value;
    if(repetirpassword != datos.contrasena){
    alert("contraseña diferente");
    return;
    }


    const peticion =await fetch('http://localhost:8080/cliente',{
        mode:'cors',
        method: 'POST',
        headers:{
            'Accept':'application/json',
            'Content-type': 'application/json',
            "Access-Control-Allow-Origin" : "*",
            "Access-Control-Allow-Credentials" : true
        },
        body:JSON.stringify(datos)

    });
}

