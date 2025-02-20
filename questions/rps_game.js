var r = 0;
var p = 0;
var s = 0;

function computerChoice(){
    const choice = ['rock', 'paper', 'scissors'];
    return choice[Math.floor(Math.random()*choice.length)];
}

function result(userChoice, computerChoice){
    //for user
    if(userChoice == computerChoice){
        return 'its tie'
    }

    if(
        (userChoice == 'rock' && computerChoice == 'scissors') ||   (userChoice == 'paper' && computerChoice == 'rock') ||  (userChoice == 'scissors' && computerChoice == 'paper')
    ){
        return 'you win'
    }else{
        return 'computer win'
    }
}



const computer = computerChoice();
alert('Computer choice: ' + computer);
const userChoice = prompt('Enter your choice: rock, paper, scissors').toLowerCase();
console.log(result(userChoice, computer));
