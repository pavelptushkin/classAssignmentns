import React from 'react';
import {NavLink} from 'react-router-dom'

const Navigation = () => {
return (
<div>
    <NavLink to="/">Home</NavLink> 
    <NavLink to="/Contact">Contact</NavLink>_ 
    <NavLink to="/About">About</NavLink> 
</div>
)
}
export default Navigation;