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
Constraint Layout was designed to support developers to build apps that cater for different screen sizes and orientations. It follows the foundational priciples that UIKit employs to manage constraint based layout (Storyboard and NSLayoutConstraint). 

<strong>General Rule:</strong> You should always use a scroll view as a parent and place the views within a Constraint Layout. Views hould be constrained to other views (app:layout_constraintBottom_toBottomOf="@+id/other_view"). <em>I am pretty sure views are layed out top to bottom, keep this in mind when referencing other views (they need to exist).</em> You can use margin properties to pad the views.

constraintVertical_bias="0.20" - This means that the view is 20% distance from the top. Bias can be very hard to work with when the orientation changes. You get weird squishing behaviour. 

###### Linear Chains
Linear Chains are used to layout views that are stacked verticall or horizontally. They are fantastic when you have a variety of fields on a form. There are a variety attributes that you can use to modify the behaviour of a chain:

- Spread: The views are evenly distributed
- Spread inside: The first and last view are constrained to a specific location, the rest are distributed evenly between.
- Weighted: Different views have difference weightings.
- Packed: You might have groups of views that are next to each other.

FillViewPort - You may need to look up what this means. It will spread the entire 


#### Linear Layout

#### Relative Layout

#### Frame Layout
