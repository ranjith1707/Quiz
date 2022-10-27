var marks=[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0];
const div = document.getElementById('mark');
 var mark=5;
function getMark(question,value){
	
   
      marks[question]=value;   
console.log(question+" "+value);
}

function  total(){
   

	for(let i=0; i<marks.length; i++){
       mark+=marks[i];
	}
	console.log(mark);
	return mark;
	


 


}


function assign(){
	div.textContent = 'Replacement text';
	div.innerHTML = mark;
}


