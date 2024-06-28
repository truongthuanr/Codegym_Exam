function bai1() {
    console.log("Run bai1()")
    let n = prompt("Nhap so cac phan tu:")
    console.log(`n = ${n}`)

    let a = []
    for (let i = 0; i < n; i++) {
        num = prompt(`Nhap so thu ${i + 1}: `);
        a.push(num)
    }

    console.log(`a = ${a}`);

    let primelist = []
    for (let num of a) {
        if (isPrime(num)){
            primelist.push(num)
        }
    }

    result = `Danh sách a:  ${a} \n\nDanh sách số nguyên tố ${primelist}`

    document.getElementById('bai1output').innerHTML = result

}

function isPrime(num) {
    let ret;
    check: {
        for (i = 2; i < num; i++) {
            // console.log("num: ",num)
            // console.log("i   : ",i)
            if ((num % i) == 0) {

                ret = false;
                // console.log("false:",ret)

                break check;
            }
        }
        // console.log("true")
        ret = true;
        // console.log("true:",ret)
    }
    // console.log('return: ',ret)
    return ret;
}


function bai2(){
    let tu1 = document.getElementById('tuso1').value
    let mau1 = document.getElementById('mauso1').value

    let tu2 = document.getElementById('tuso2').value
    let mau2 = document.getElementById('mauso2').value

    if (tu1=="" || tu2=="" || mau1=="" || mau2==""){
        alert("Vui lòng nhập đủ các số")
        return
    }

    if(tu1*mau2==tu2*mau1){
        alert("Hai phân số bằng nhau")
    } else{
        alert("Hai phân số không bằng nhau")
    }



}