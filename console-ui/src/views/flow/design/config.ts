import { ElementType } from '@/views/flow/design/types.ts';

export const nodeMap = {
  [ElementType.METHOD]: {
    nodeName: '方法节点',
    nodeHeaderColor: '#6bcb7b',
  },
  [ElementType.CONDITION]: {
    nodeName: '判断节点',
    nodeHeaderColor: '#e5cf7a',
  },
  [ElementType.CODE]: {
    nodeName: '代码节点',
    nodeHeaderColor: '#b471e7',
  },
  [ElementType.MYSQL]: {
    nodeName: 'MySql节点',
    nodeHeaderColor: '#48a6bb',
  },
  [ElementType.AI]: {
    nodeName: 'AI节点',
    nodeHeaderColor: '#640505',
  },
};
