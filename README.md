# Habit Tracker Android
##### James Jasenia, 2020

## Architecture:
- Jetpack Navigation Components

## UI Testing:
- BottomNavigationMenu
- Fragments


## Learning:
### Action Bar:
- Updating the action bar using Navigation Components. In the nax_graph.xml file, each fragment has a label parameter. This label parameter is displayed in the title text view.

### Dependencies:
- First, check your dependencies when things are not working as expected.

### Layout Systems
#### Coordinator Layout

#### Constraint Layout
Constraint Layout was designed to support developers to build apps that cater for different screen sizes and orientations.

constraintVertical_bias="0.20" - This means that the view is 20% distance from the top. Bias can be very hard to work with when the orientation changes. You get weird squishing behaviour. Having a scroll view as a parent makes rotation behaviour.

General Rule: You should always use a scroll view as a parent and the place the constraint layout inside. Where possible constrain elements to other elements.
<strong><em>I am pretty sure that the layout is top to bottom</em></strong> When you are using this system, you have no need for the bias.

This is a very similar constraint based system as Apple's UIKit. 

Control Linear Groups with a chain - Situation where you need to put elements next to each other (think of the a fields for a form).
Attributes of a chain:
- Spread: The views are evenly distributed
- Spread inside: The first and last view are constrained to a specific location, the rest are distributed evenly between.
- Weighted: Different views have difference weightings.
- Packed: You might have groups of views that are next to each other.


#### Linear Layout

#### Relative Layout

#### Frame Layout
