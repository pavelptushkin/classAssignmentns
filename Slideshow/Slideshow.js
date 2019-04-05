var slideshow = {
    photoList: [
        'img1.jpg',
        'img2.jpg',
        'img3.jpg'
    ],
    currentPhotoIndex: 0,
    nextPhoto: function() {
        if(this.currentPhotoIndex == this.photoList.length - 1) {
            console.log('End of slideshow');
            this.pause();
        } else {
            this.currentPhotoIndex++;
            console.log(this.photoList[this.currentPhotoIndex]);
        }
    },
    prevPhoto: function() {
        if(this.currentPhotoIndex == 0) {
            console.log('Beginning of slideshow');
        } else {
            this.currentPhotoIndex--;
            console.log(this.photoList[this.currentPhotoIndex]);
        }
    },
    getCurrentPhoto: function() {
        return this.photoList[this.currentPhotoIndex]
    },
    playInterval: null,
    play: function() {
        this.playInterval = setInterval(this.nextPhoto.bind(this), 2000);
    },
    pause: function() {
        clearInterval(this.playInterval);
    }
}

slideshow.play();