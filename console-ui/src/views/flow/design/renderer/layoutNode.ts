
import { NodeData } from '../types';
import { TreeNode } from './treeNode';

export class LayoutNode extends TreeNode {

  constructor (params: {
    left: number;
    top: number;
    width: number;
    height: number;
    data: NodeData
    linesTo: string[];
  }) {
    super();
    this.data = params.data;
    this.linesTo = params.linesTo;
    this.setSize(params.width, params.height);
    this.setRelative(params.left, params.top);
  }

  data: NodeData;

  linesTo: string[];

  private _width = 0;

  private _height = 0;

  private _top = 0;

  private _left = 0;

  get width () {
    return this._width;
  }

  get height () {
    return this._height;
  }

  get top () {
    return this._top;
  }

  get left () {
    return this._left;
  }
  
  get bottom () {
    return this.top + this.height;
  }

  get right () {
    return this.left + this.width;
  }

  get x () {
    const parent = this.getParent();
    const parentX: number = parent.x || 0;
    return this.left + parentX;
  }

  get y () {
    const parent = this.getParent();
    const parentY: number = parent.x || 0;
    return this.left + parentY;
  }

  setSize (width: number, height: number) {
    this._width = width;
    this._height = height;
  }

  setRelative (left: number, top: number) {
    this._left = left;
    this._top = top;
  }

  public getChildren() {
    return super.getChildren() as LayoutNode[];
  }

  public getParent() {
    return super.getParent() as LayoutNode;
  }
}