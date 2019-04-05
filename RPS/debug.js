// Debug the following code
 var company = {
    employees: [
        {
            name: "doug"
        },
        {
            name: "AJ"
        }
    ],
    getName: function(employee){
        return employee.name
    },
    getNames: function(){
        return this.employees.map(this.getName)
    },
    delayedGetNames: function(){
        setTimeout(() => console.log(this.getNames()),500)
    }
}
//setTimeout(this.getNames.bind(this), 500)
company.delayedGetNames();