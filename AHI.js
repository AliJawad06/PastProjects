var json2xls = require("json2xls");
var fs = require("fs");
var pare = require('papaparse');
fs.readdir("Al-Hirz-Files/2",{options:String}, function(err,files){
    if(err){
        console.log(err);
    }
    else{
       // console.log(files);
        var texts = [];
        files.forEach(element => {
            texts.push(element.substring(0,element.length-4));
            
        });
        //console.log(texts);
        //console.log(files); 
        var headers = ["file","text"];
        var data = [];
        
        for(var i = 0; i < texts.length; i++){
            var str = '[sound:' + files[i]+ ']'
            data.push({
                text: texts[i],
                file: str
            });
        }

        console.log(data);
         var csv = pare.unparse(data);
fs.writeFileSync('data.csv', csv, 'binary');
    }

});