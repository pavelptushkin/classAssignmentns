function Profile (name,address,city,state,zipcode,avatar){
    this.name = name;
    this.address = address;
    this.city = city;
    this.state = state;
    this.zipcode = zipcode;
    this.avatar = avatar;
}

Profile.prototype = {
    getProfileUpdate(){
        return {name:"John Doe",address: "Middle of Nowhere",zipcode: "Unknown"}
    },
    updateProfile:function(){Object.assign(this,this.getProfileUpdate())}
}
 var pr1 = new Profile("a","b","c","d","e","f");
 console.log(pr1);
 pr1.updateProfile();
 console.log(pr1);